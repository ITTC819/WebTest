/**
 * Created with JetBrains WebStorm.
 * User: YYbupt
 * Date: 15-6-22
 * Time: 上午9:00
 * To change this template use File | Settings | File Templates.
 */
    var pic_QS=new Image();
    pic_QS.addEventListener('load',drawImg,false);
    pic_QS.src="image/QuShuiFang.jpg";
    function drawImg(){
        context.drawImage(pic_QS,0,0,1135,658);
    }
    var canvas = document.getElementById("canvas_QS");
    var context = canvas.getContext("2d");
    var btn_start=document.getElementById("btn_start");
    btn_start.addEventListener('click',f_startQS,false);
    function f_startQS(){
        var SC_height = 0, SC_width = 200, Speed = 0.5;
        context.strokeStyle = "#002800";
        context.lineWidth = 1;
        //context.strokeRect(230 - 1, 200 - 1, 200 + 2, 200 + 2);
        flash();
        function flash() {
            var canvas = document.getElementById("canvas_QS"),
                context = canvas.getContext("2d");
            context.fillStyle = "#05CBFC";
            SC_height = SC_height + Speed;
            var pos = 405 - SC_height;
            context.fillRect(232, pos, SC_width, SC_height);
            context.fillRect(232, pos+215, SC_width, SC_height);

            if (SC_height < 207) {
//        setTimeout(flash,Interval);
                window.requestAnimationFrame(flash);
            }
            else {
                context.fillStyle = "blue";
                context.fillRect(232, pos, SC_width, SC_height);
                context.fillRect(232, pos+215, SC_width, SC_height);
            }
        }
    }






