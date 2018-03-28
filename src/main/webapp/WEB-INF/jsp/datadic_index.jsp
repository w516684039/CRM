<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script type="text/javascript">
		$(function() {
			$("#datagrid").datagrid({
				url : "${ctx}/datadic/pageList.action",
				method : "get",
				fit : true,
				fitColumns : true,
				pagination : true,
				toolbar: "#toolbar",
				columns : [[
					{field:"cb",checkbox:true,align:"center"},
					{field:"id",title:"ID",width:80,align:"center"},
					{field:"dataDicName",title:"名称",width:100,align:"center"},
					{field:"dataDicValue",title:"关系",width:80,align:'center'},
				]],
			});
			
			/* 初始化添加dialog */
			$("#dialog").dialog({
				closed : true,
			    buttons : [
			        {
			        	text : "保存",
			        	iconCls : "icon-ok",
			        	handler : function() {
			        		doAddOrUpdate();
			        	}
			        },
			        {
			        	text : "关闭",
			        	iconCls : "icon-cancel",
			        	handler : function() {
			        		$("#dialog").dialog("close");
			        	}
			        }
			    ]
			}); 
		});
		
		
		
		//搜索
		function doSearch(){
			$('#datagrid').datagrid('load',{
				dataDicName : $("#s_name").val(),
				dataDicValue: $("#s_value").val(),
			});
		}
		//删除
		function doDelete(){
			//getSelections none 返回所有被选中的行，当没有记录被选中的时候将返回一个空数组。
			var ids = util.getSelectedIds($("#datagrid").datagrid("getSelections"));
			if(ids.length == 0){
				$.messager.alert("系统提示","请选择要删除的数据");
				return;
			}
			$.messager.confirm("系统提示","确认要删除这"+ids.length+"条数据么",function(r){
				if(r){
					ids = ids.join(',');
					$.ajax({
						url : "${ctx}/datadic/delete.action",
						data:{ids : ids},
						dataType : "json",
						type : "POST",
						success : function(jsonObj){
							$.messager.alert("系统提示", jsonObj.msg);
							if(jsonObj.status == util.SUCCESS) {
								$("#datagrid").datagrid("reload");
							}
						}
					});
				}
			});
		}
		
		var url;
		//添加
		function openAddDialog(){
			url = "${ctx}/datadic/add.action"
			$("#dialog").dialog("open");
			$("form").form("clear");
		}
		
		//修改
		function openUpdateDialog(){
			url = "${ctx}/datadic/update.action"
			var selections = $("#datagrid").datagrid("getSelections");
			if(selections.length == 0){
				$.messager.alert("系统提示","请选择要修改的行");
				return;
			}
			var row = selections[0];
			$("#dialog").dialog("open").dialog("setTitle", "修改信息");
			//load读取记录填充到表单中。数据参数可以是一个字符串或一个对象类型，如果是字符串则作为远程URL，否则作为本地记录
			$("form").form("load", row);
		}
		
		//真正的去添加和修改用户
		function doAddOrUpdate() {
			$("#form").form("submit", {
				url : url,
				onSubmit : function() {/* // do some check
					if($("#roleName").combobox("getValue") == "") {
						$.messager.alert("系统提示", "请选择用户角色");
						return $(this).form("validate");//返回false终止表单提交
					} */
					return $(this).form("validate");//返回false终止表单提交
				},
				success : function(data) {
					// change the JSON string to javascript object
					var jsonObj = eval("(" + data + ")");
					$.messager.alert("系统提示", jsonObj.msg);
					if(jsonObj.status == util.SUCCESS) {
						$("#dialog").dialog("close");
						$("#datagrid").datagrid("reload");
					}
				}
			})
		}
	</script>
</head>
<body>
	<table id="datagrid"></table>
	
	<!-- toolbar开始 -->
	<div id="toolbar">
		<a href="javascript:openAddDialog()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
		<a href="javascript:openUpdateDialog()" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
		<a href="javascript:doDelete()" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">删除</a>
		<div>
			名称：
				 <input id="s_name" class="easyui-combobox" name="dept"   
    				data-options="
    				url:'${ctx}/datadic/selectDataDicName.action',
    				valueField:'dataDicName',
    				textField:'dataDicName',
    				panelHeight:'auto' " />
    			 
			关系：<input type="text" id="s_value"/>
			
			<a href="javascript:doSearch()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a>
		</div>
	</div>
	<!-- toolbar结束 -->
	
	<!-- 添加和修改的dialog 开始 -->
    <div id="dialog" style="width:650;height:280,padding: 10px 20px">
       <form action="" id="form" method="post">
           <input type="hidden" id="id" name="id"/>
           <table cellspacing="8px">
               <tr>
                  <td>名称：</td>
                  <td><div>
			名称：<input id="dataDicName" class="easyui-combobox" name="dataDicName" required="true"
    				data-options="
    				url:'${ctx}/datadic/selectDataDicName.action',
    				valueField:'dataDicName',
    				textField:'dataDicName',
    				panelHeight:'auto',
    				" /><font color="red">*</font>
    			 
					</div></td>
                   <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                  <td>关系：</td>
                  <td><input type="text" id="dataDicValue" name="dataDicValue" class="easyui-validatebox" required="true"/><font color="red">*</font></td>
               </tr>
           </table>
       </form>
    </div>
    <!-- 添加和修改的dialog 结束 -->
</body>
</html>