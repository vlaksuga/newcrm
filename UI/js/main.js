/* DatePicker */
$(function () {
    $.datepicker.setDefaults({
        dateFormat: 'yy-mm-dd'
        , showOtherMonths: true
        , showMonthAfterYear: true
        , changeYear: true
        , changeMonth: true
        , monthNamesShort: ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12']
        , monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월']
        , dayNamesMin: ['일', '월', '화', '수', '목', '금', '토']
        , dayNames: ['일요일', '월요일', '화요일', '수요일', '목요일', '금요일', '토요일']
        , minDate: "-1Y"
        , maxDate: "today"
    });
    $("#datepicker_start").datepicker();
    $("#datepicker_end").datepicker();
});

/* Chart Config */

$(function () {

    /* 진행별  - RADAR */
    var ctx = document.getElementById('myChart1');
    var myChart1 = new Chart(ctx, {
        type: 'radar',
        data: {
            labels: ['대기', '신규', '가망', '결재', '부재', '결번', '본인아님', '거절', '강제폐기'],
            datasets: [{
                label: '# 긍정적 진행 주문 ',
                data: [7, 4, 5, 7, 9, 0, 0, 0, 0],
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)'
                ],
                borderColor: [
                    'rgba(54, 162, 235, 1)'
                ],
                borderWidth: 1
            },
            {
                label: '# 부정적 진행 주문',
                data: [0, 0, 0, 0, 0, 10, 9, 22, 15],
                backgroundColor: [
                    'rgba(255, 0, 0, 0.2)'
                ],
                borderColor: [
                    'rgba(255, 0, 0, 1)'
                ],
                borderWidth: 1
            }],
        },
        options: {
            maintainAspectRatio: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            }
        }
    })

    /* 기기별  - POLARAREA */
    var ctx = document.getElementById('myChart2');
    var myChart2 = new Chart(ctx, {
        type: 'polarArea',
        data: {
            labels: ['WEB', 'MOBILE', 'ETC'],
            datasets: [{
                label: '# 기기별 ',
                data: [37, 45, 5],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                ],
                borderWidth: 1
            }]
        },
        options: {
            maintainAspectRatio: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            }
        }
    });

    /* 요일별 - BAR */
    var ctx = document.getElementById('myChart3');
    var myChart3 = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: ['월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일'],
            datasets: [{
                label: '# 요일별 ',
                data: [7, 4, 5, 7, 9, 10, 9],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(255, 159, 64, 0.2)'
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            maintainAspectRatio: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            }
        }
    });

    /* 일별 -LINE */
    var ctx = document.getElementById('myChart4');
    var myChart4 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['19-09-16', '19-09-17', '19-09-18', '19-09-19', '19-09-20', '19-09-21', '19-09-22'],
            datasets: [{
                label: '# 일별 ',
                data: [7, 4, 5, 7, 9, 10, 9],
                backgroundColor: [
                    'rgba(255, 99, 132, 0)'
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            maintainAspectRatio: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            }
        }
    });

    /* 소스별 - PIE */
    var ctx = document.getElementById('myChart5');
    var myChart5 = new Chart(ctx, {
        type: 'pie',
        data: {
            labels: ['VLAKSUGA', 'GDN', 'DABLE', 'ADIN', 'IMAD'],
            datasets: [{
                label: '# 기기별 ',
                data: [37, 45, 5, 22, 10],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)'
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            maintainAspectRatio: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            }
        }
    });

    /* 연령별 - HORIZONTALBAR */

    var ctx = document.getElementById('myChart6');
    var myChart6 = new Chart(ctx, {
        type: 'horizontalBar',
        data: {
            labels: ['-10대', '20대', '30대', '40대', '50대', '+60대'],
            datasets: [{
                label: '# 연령별 주문 통계',
                data: [7, 4, 5, 7, 9, 10],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(255, 159, 64, 0.2)'
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            maintainAspectRatio: false,
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            }
        }
    });

});

