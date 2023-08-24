import logo from './logo.svg';
import './App.css';
import React, { useState } from 'react';

const RecordForm = ({numList, setNumList}) =>{
  const [num, setNum] = useState(0);
  return(
    <div>
      <div>현재 숫자 : {num}</div>
      <button onClick={()=>{setNum(num+1)}}>숫자 증가</button>
      <button onClick={()=>{setNum(num-1)}}>숫자 감소</button>
      <button onClick={()=>{setNum(0)}}>숫자 초기화</button>
      <hr/>
      <button onClick={()=>setNumList([...numList, num])}>숫자 기록</button>
      <button onClick={()=>setNumList([])}>기록초기화</button>
    </div>
  )
}
const RecordList = ({numList}) =>{
  return (
    <div>
      <h2>기록된 숫자</h2>
      {numList.length > 0 ?<div>기록있음</div> : <div>기록 없음</div>}
    </div>
  )
}  
const App = () => {

  const [numList, setNumList] = useState([]);
  return(
    <div style={{margin:"40px auto",width:"800px",textAlign :"center"}}>
        <RecordForm numList = {numList} setNumList = {setNumList}/>
        <RecordList numList = {numList}/>
    </div>


  )

}

function App() {
    /* const { num, setNum } = useState(0); /* 현재의 숫자를 타타냄 초기화 값 0버튼으로 증가감소 */
    const [numList, setNumList] = useState([]); /* 기록된 숫자를 저장할 배열 처음에는 빈배열로 시작하며, '숫자기록버튼이 클릭될때 업데이트 된다.' */
    function numRecoding() {
        setNumList([...numList, num]);
        setNum(0);
    } 
}  */
return (
    {/* <div className="App">
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
    </div> */}
);

export default App;