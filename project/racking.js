const newsTicker = (timer) => {
    const $ul = document.querySelector('ul');
  
    window.setInterval(() => {
      $ul.style.transitionDuration = "400ms";
      $ul.style.marginTop = "-34px";
  
      window.setTimeout(() => {
        $ul.style.transitionDuration = "";
        $ul.style.marginTop = "";
        // send the first element to the back 400ms later.
        $ul.appendChild($ul.querySelector("li:first-child"));
      }, 400)
  
    }, timer)
  }
  
  newsTicker(1500)
  