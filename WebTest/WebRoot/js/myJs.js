/**
 * Created with JetBrains WebStorm.
 * User: YYbupt
 * Date: 15-6-28
 * Time: 下午8:20
 * To change this template use File | Settings | File Templates.
 */
//$(".start_play").click(function(){
//    $.ajax({url:"QuShui.html",success:function(result){
//        $(".myContent").html(result);
//    }});
//});
//$(".start_play").click(function(){
//     $(".myContent").html="QuShui.html";
//});
var StartPlay = document.getElementById("StartPlay");
StartPlay.onclick =function () {
//    document.getElementById("myQuShui").style.display = "inline";
//    document.getElementById("StartPlay").style.display="none";
    //frame框架方法
//    document.getElementById("myContent").innerHTML="<iframe src='QuShui.html' width='1100px' height='500px' style=''></iframe>";
    //load方法
//    $("#myContent").load("QuShui.html");
    $("#myContent").load("mainView.html");
}
function f_mainView(){
    $("#myContent").load("mainView.html");
}
function f_QuShui(){
    $("#myContent").load("QuShui.html");
}
