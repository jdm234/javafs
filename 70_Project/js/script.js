$(function () {

    // 프로그래스바
    let progressState = 0;

    $(window).scroll(function () {
        if ($(this).scrollTop() >= 150) {
            if (progressState === 0) {
                pgbar(0, 95);
                pgbar(1, 85);
                pgbar(2, 75);
                progressState = 1;
            } else {
                return;
            }
        } else {
            progressState = 0;
        }
    });

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



    // 카운터
    const elem = $('#counter span');
    let state = 0;

    $(window).scroll(function () {
        // 윈도우 스크롤이 150이상이면
        if ($(this).scrollTop() >= 2150) {
            if (state === 0) {
                move(0, 32, 100);
                move(1, 8, 200);
                move(2, 4, 300);
                move(3, 3, 400);
                state = 1;
            } else {
                return
            }
        } else {
            state = 0;
        }
    });

    function move(idx, maxCnt, mSec) {
        let num = 0;
        // counter 함수를 0.1초마다 실행
        const timer = setInterval(counter, mSec);
        function counter() {
            if (num >= maxCnt) {
                clearInterval(timer);
            } else {
                num++;
                elem.eq(idx).text(`${num}+`);
            }
        }
    }


});