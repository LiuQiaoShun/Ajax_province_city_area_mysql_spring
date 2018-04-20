<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>三级联动</title>
</head>
<body>
<select id="provinceSelector">
    <option value="">请选择省份...</option>
    <c:forEach items="${province}" var="province">
        <option value="${province.provinceid}">${province.province}</option>
    </c:forEach>
</select>

<select id="citySelector">
    <option value="">请选择城市...</option>
</select>

<select id="districtSelector">
    <option value="">请选择区域...</option>
</select>

<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
        //选择省
        $("#provinceSelector").change(function () {
            //获取选中的省编号
            var provinceid=$(this).find("option:selected").val();
            //通过 省份 code ，获取省份下面的城市
            //1. 清空 原有的 城市和区县内容
            $("#citySelector").empty();

            $.ajax({
                type:"post",//请求方式get/post
                dataType:"json",
                url:"/queryCityByProvinceId",//请求对应的地址
                data:{"provinceid":provinceid},//往服务器传递的参数，
                success:function(data) {//服务器交互成功调用的回调函数，data就是服务器端传递出来的数据
                    $("#districtSelector").empty();//清空城市下面的区县
                    $("#citySelector").append("<option value=''>"+'--请选择市--'+"</option>");
                    $("#districtSelector").append("<option value=''>"+'--请选择区县--'+"</option>");
                    var jdata = data; // 去前后空格
                    console.log(jdata);
                    if (jdata == "fail") {
                        alert("查询失败!");
                    } else {
                        $.each(jdata,function(i,item){
                            var _ele="<option value='"+item.cityid+"'>"+item.city+"</option>";
                            $("#citySelector").append(_ele);
                        });
                    }
                }
            });
        });

        //选择市
        $("#citySelector").change(function () {
            //获取选中的市编号
            var cityid=$(this).find("option:selected").val();

            $.ajax({
                type:"post",//请求方式get/post
                dataType:"json",
                url:"/queryAreaByCityId",//请求对应的地址
                data:{"father":cityid},//往服务器传递的参数，
                success:function(data){//服务器交互成功调用的回调函数，data就是服务器端传递出来的数据
                    $("#districtSelector").empty();
                    $("#districtSelector").append("<option value=''>"+'--请选择区县--'+"</option>");
                    var jdata = data;
                    if (jdata == "fail") {
                        alert("查询失败!");
                    } else {
                        $.each(jdata,function(i,item){
                            var _ele="<option value='"+item.areaid+"'>"+item.area+"</option>";
                            $("#districtSelector").append(_ele);
                        });
                    }
                }
            });
        });

    });
</script>
</body>
</html>
