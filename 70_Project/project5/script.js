$(function(){
    $(window).scroll(function () {
        if ($(this).scrollTop) >= 150) {
            if (state === 0) {
                pgbar(95)
                pgbar(85)
                pgbar(75)
                bar();
                state = 1;
            } else {
                return;
            }
        } else {
            state = 0;
        }
    )};

    function pgbar(idx, maxCnt) {
        var elem = $(".progress");
        var w = 0;
        var timer = setInterval(bar, 30);

        function bar() {
            if (w >= maxCnt) {
                clearInterval(timer);
            } else {
                w++;
                elem.eq(idx).find({ width: w + "%" });
                elem.eq(idx).find(w + "%");
            }
        }
    }
});
// 프로그래스바
