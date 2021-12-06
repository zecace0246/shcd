let date = new Date();

const renderCalender = () => {
  var viewYear = date.getFullYear();
  var viewMonth = date.getMonth();

  var curYymmStr = viewYear+"년 "+ (viewMonth+1) + "월";

  $('.year-month').text(curYymmStr);

  const prevLast = new Date(viewYear, viewMonth, 0);
  const thisLast = new Date(viewYear, viewMonth + 1, 0);

  const PLDate = prevLast.getDate();
  const PLDay = prevLast.getDay();

  const TLDate = thisLast.getDate();
  const TLDay = thisLast.getDay();

  const prevDates = [];
  const thisDates = [...Array(TLDate + 1).keys()].slice(1);
  const nextDates = [];

  if (PLDay !== 6) {
    for (let i = 0; i < PLDay + 1; i++) {
      prevDates.unshift(PLDate - i);
    }
  }

  for (let i = 1; i < 7 - TLDay; i++) {
    nextDates.push(i);
  }

  const dates = prevDates.concat(thisDates, nextDates);
  const firstDateIndex = dates.indexOf(1);
  const lastDateIndex = dates.lastIndexOf(TLDate);
  var vDate ;

  dates.forEach((date, i) => {
    const condition = i >= firstDateIndex && i < lastDateIndex + 1
                      ? 'this'
                      : 'other';

    //console.log("condition :::>>>>> " + condition);
    //console.log(" date ::::>>  "+ date);

    dates[i] = '<div class="date"><span class='+condition+'>'+date;
    dates[i] +='</a></span>';
             if(condition == 'this' ){
                if( eval(viewMonth+1) < 10 ) viewMonth = "0" +eval(viewMonth+1) ;

                if( eval(date) < 10){
                   vDate = "0"+ eval(date);
                }else{
                   vDate = eval(date);
                }

                dates[i] += '<div><button type="button" class="btn btn-outline-success btn-sm" id=cal_'+ viewYear+''+(viewMonth+1)+''+vDate+ '>S</button></div>';
             }
    dates[i] +='</div>';
  });

  //document.querySelector('.dates').innerHTML = dates.join('');
  $('.dates').html(dates.join(''));

  const today = new Date();
  if (viewMonth === today.getMonth() && viewYear === today.getFullYear()) {
    for (let date of document.querySelectorAll('.this')) {
      if (+date.innerText === today.getDate()) {
        date.classList.add('today');
        break;
      }
    }
  }
};

renderCalender();

const prevMonth = () => {
  date.setMonth(date.getMonth() - 1);
  renderCalender();
};

const nextMonth = () => {
  date.setMonth(date.getMonth() + 1);
  renderCalender();
};

const goToday = () => {
  date = new Date();
  renderCalender();
};