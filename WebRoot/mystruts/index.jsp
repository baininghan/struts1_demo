<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!doctype html>
<html lang="zh">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="BaiNingHan">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>主界面</title>
 </head>
 <body>
    <table align="center" cellpadding="10" width="100%">
       <tr>
           <td align="right" width="50%">
           <%-- 使用Struts tag--%>
               <html:link forward="newProduct">录入产品信息</html:link>
           </td>
           <td>
               <html:link forward="searchProduct">查询产品信息</html:link>
           </td>
       </tr>
   </table>
 </body>
</html>
