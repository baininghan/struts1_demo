<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!doctype html>
<html lang="zh">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>录入产品信息</title>
 </head>
 <body>
  <%-- 向saveProduct动作提交产品信息 --%>
  <html:form action="saveProduct"> 
      <table width="100%">
          <tr>
              <td align="center">
                  产品编号：
                  <html:text property="productID" maxlength="4" />
                  <p>
                      产品名称：
                      <html:text property="productName" />
                  <p>

                      产品价格：
                      <html:text property="price" />
              </td>
          </tr>
          <tr>
              <td align="center">
                  <br>
                  <html:submit value=" 保存 " />
              </td>
          </tr>
      </table>
  </html:form>
 </body>
</html>