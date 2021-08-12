<%--
  Created by IntelliJ IDEA.
  User: kylargo
  Date: 2021/8/6
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/AddUser" method="post">
    account：<input type="text" name="account"><br><br><br>
    password：<input type="text" name="password"><br><br><br>
    name：<input type="text" name="name"><br><br><br>

    gender：<input type="text" name="gender"><br><br><br>
    idCard：<input type="text" name="idCard"><br><br><br>
    idCardFrontFile：<input type="text" name="idCardFrontFile"><br><br><br>
    idCardBackFile：<input type="text" name="idCardBackFile"><br><br><br>
    userPhoneNum：<input type="text" name="userPhoneNum"><br><br><br>
    mail：<input type="text" name="mail"><br><br><br>
    post：<input type="text" name="post"><br><br><br>
    kind：<input type="text" name="kind"><br><br><br>
    companyName：<input type="text" name="companyName"><br><br><br>
    comRegisterArea：<input type="text" name="comRegisterArea"><br><br><br>
    comPostalCode：<input type="text" name="comPostalCode"><br><br><br>
    comPhoneNum：<input type="text" name="comPhoneNum"><br><br><br>
    fax：<input type="text" name="fax"><br><br><br>
    legalPersonName：<input type="text" name="legalPersonName"><br><br><br>
    legalIDCard：<input type="text" name="legalIDCard"><br><br><br>
    legalIDCardFrontFile：<input type="text" name="legalIDCardFrontFile"><br><br><br>
    legalIDCardBackFile：<input type="text" name="legalIDCardBackFile"><br><br><br>
    legalPhoneNum：<input type="text" name="legalPhoneNum"><br><br><br>
    companyProfile：<input type="text" name="companyProfile"><br><br><br>
    bankAccount：<input type="text" name="bankAccount"><br><br><br>
    bankName：<input type="text" name="bankName"><br><br><br>
    USCC：<input type="text" name="USCC"><br><br><br>
    -USCCFile：<input type="file" name="USCCFile"><br><br><br>
    OIBC：<input type="text" name="OIBC"><br><br><br>
    -OIBCFile：<input type="file" name="OIBCFile"><br><br><br>
    TRC：<input type="text" name="TRC"><br><br><br>
    -TRCFile：<input type="file" name="TRCFile"><br><br><br>
    -businessLicense：<input type="file" name="businessLicense"><br><br><br>
    -businessLicenseFile：<input type="file" name="businessLicenseFile"><br><br><br>
    registerFund：<input type="text" name="registerFund"><br><br><br>
    status：<input type="text" name="status"><br><br><br>
    <input type="submit" value="添加">
</form>
</body>
</html>
