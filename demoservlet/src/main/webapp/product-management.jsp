<%@ page isELIgnored="false" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<%--
    <%! %> : thẻ dùng để khai báo biến
    <% %> : Thẻ dùng để xử lý logic code , thẻ đa năng
    <%= %> : Xuất giá trị biến ra ngoài màn hình
--%>
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <% String contextPath = request.getContextPath(); %>
        <div class="row m-b-5">
            <form class="form-group w-100" action="<%=contextPath%>/products" method="post">
                <div class="col-8 m-b-2">
                    <label>Product name</label>
                    <input type="text" class="form-control" name="name" />
                </div>
                <div class="col-8 m-b-2">
                    <label>Quantity</label>
                    <input class="form-control" name="quantity" />
                </div>
                <div class="col-8 m-b-2">
                    <label>Price</label>
                    <input class="form-control" name="price" />
                </div>
                <div class="col-8 m-t-5">
                    <button class="btn btn-primary">Save</button>
                </div>
            </form>
        </div>
        <div class="row">
            <div class="col-12">
                <table class="table">
                    <thead>
                        <tr>
                            <th>
                               Order
                            </th>
                            <th>
                                Product name
                            </th>
                            <th>
                                Quantity
                            </th>
                            <th>
                                Price
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${list}" var="item" >
                                <tr>
                                    <td>
                                       ${item.name}
                                    </td>
                                    <td>${item.quantity}</td>
                                    <td>${item.price}</td>
                                </tr>

                        </c:forEach>
                        <tr>
                            <td>
                                1
                            </td>
                            <td>
                               Iphone
                            </td>
                            <td>
                               20
                            </td>
                            <td>
                                1000000
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>