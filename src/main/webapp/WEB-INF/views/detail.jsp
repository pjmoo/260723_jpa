<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>JPA</title>
</head>
<body>
<h1>JPA</h1>
<section>
    <form method="post" action="/${book.id}">
        <p>책 번호 : ${book.id}</p>
        <input name="title" placeholder="책 이름" value="${book.title}"><br>
        <input name="author" placeholder="작가 이름" value="${book.author}"><br>
        <button>수정</button>
        <a href="/delete/${book.id}">삭제</a>
        <a href="/">뒤로가기</a>
    </form>
</section>
</body>
</html>
