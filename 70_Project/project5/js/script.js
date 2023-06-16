// 문서가 준비되면 함수 실행
$(function () {

    //헤더
    const headerBg = $('#header');

    // 윈도우에 스크롤 이벤트가 발생하면 함수 실행
    $(window).scroll(function () {
        // 스크롤바를 스크롤한 양을 st에 저장
        let st = document.documentElement.scrollTop;
        let stVal = 600;

        if (st >= stVal) {
            headerBg.css({ background: '#888' })
        } else {
            headerBg.css({ background: 'transparent' })
        }
    });
    // 내비게이션바
    $('.main > li > a').mouseenter(function (e) {
        // a태그 기본 이벤트 제거
        e.preventDefault();
        $('.sub').stop().slideDown(400);
        $('.nav_bg').stop().animate({ height: 180 }, 400);
    });
    $('nav').mouseleave(function () {
        $('.sub').stop().slideUp(400);
        $('.nav_bg').stop().animate({ height: 0 }, 400);
    });

    // 비디오 자동플레이
    // $('video').get(0).play();

    //섹션 1 캐로셀
    $('.slider').bxSlider({
        // 자동 실행
        auto: true,
        stopAutoOnClick: true,
        // 일시정지와 재실행 버튼
        /* autoControls: true, */
        /* pager: false, */
        /* slideWidth: 1400 */
      });

    // 풀페이지 레이아웃
    $('.section').mousewheel(function (e, delta) {
        let prev;
        if (delta > 0) {
            prev = $(this).prev().offset().top;
            console.log(prev);
            $('html').stop().animate({ scrollTop: prev }, 400, 'easeOutExpo');
        } else if (delta < 0) {
            let next = $(this).next().offset().top;
            console.log(next);
            $('html').stop().animate({ scrollTop: next }, 400, 'easeOutExpo');
        }
    });
});

// 섹션2 - ???
const sec2 = $('.secton2'),
    btn = sec2.find('.btn'),
    txt1 = sec2.find('.txt1'),
    txt2 = sec2.find('.txt2');

$(window).scroll(function () {
    let st = $(this).scrollTop();
    let stVal = 600;
    console.log(st);

    if (st >=stVal) {
        btn.css({opacity:1});

    }
});

// 섹션3: 탭
        const tabBtn = $('#section3 .thumb li'),
              bigImg = $('.big li'),
              txt = $('#section3 .txt li');

        tabBtn.click(function(){
            let idx = $(this).index();
            tabBtn.removeClass('active');
            bigImg.removeClass('active');
            txt.removeClass('active');
            $(this).addClass('active');
            bigImg.eq(idx).addClass('active');
            txt.eq(idx).addClass('active');
        });

