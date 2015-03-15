<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!doctype html>
<html lang="zh">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>查询产品信息</title>
 </head>
 <body>
   <%--  向searchProduct动作提交查询请求 --%>
 <html:form action="searchProduct">
     <table width="100%">
         <tr>
             <td align="center">
                 产品名称：
                 <html:text property="productName" />
             </td>
         </tr>
         <tr>
             <td align="center">
                 <br>
                 <html:submit value=" 查询 " />
             </td>
         </tr>
     </table>
 </html:form>
 </body>
</html>