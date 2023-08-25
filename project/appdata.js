import React, { useState, useEffect } from 'react';
import axios from 'axios';

const App = () => {
  const [text, setText] = useState([111]);
  const [edit, setEdit] = useState([]);
  let content = <div>{text}
  <button onClick={() => setEdit(true)}>수정</button>

  if(edit){
    content=<div>
      <input type="text"
      value={text}
      onChange={(e) =>{
        setText(e.target.value);
      }}
    />
    <button onClick={() => setEdit(false)}>수정</button>
    </div>
  }

  return (
  <>
    {conent}
  </>
  )


export default App;

{/* function App() {
     const { num, setNum } = useState(0);  현재의 숫자를 타타냄 초기화 값 0버튼으로 증가감소
    const [numList, setNumList] = useState([]); /* 기록된 숫자를 저장할 배열 처음에는 빈배열로 시작하며, '숫자기록버튼이 클릭될때 업데이트 된다.'
    function numRecoding() {
        setNumList([...numList, num]);
        setNum(0);
    } 
}    */}
 {/* return (
    {<div className="App">
        <div>현재숫자 : {num}</div>
        <button onclick={() => { setNum(num + 1) }} 숫자 증가></button>
        <button onclick={() => { setNum(num - 1) }} 숫자 감소></button>
        <button onclick={numRecoding}>숫자 기록</button>
        <h1>저장된 숫자</h1>
        <ul>
            {numList.map((num) => {
                <li>{num}</li>
            })}
        </ul>
    </div>}
);  */}

