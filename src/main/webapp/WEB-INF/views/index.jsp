<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>JPA</title>
</head>
<body>
<h1>JPA</h1>
<section>
    <form method="post">
        <input name="title" placeholder="책 이름"><br>
        <input name="author" placeholder="작가 이름"><br>
        <button>추가</button>
    </form>
</section>
<section>
    <c:forEach items="${books}" var="book">
        <p>${book} <a href="/${book.id}">자세히보기</a></p>
    </c:forEach>
</section>
</body>
</html>
