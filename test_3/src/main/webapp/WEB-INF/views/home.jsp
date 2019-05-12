<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<h1>테스트1111</h1>
 
 
 <h1>다양한 폼 컨트롤 input</h1>


 <form action="/ff/test.do" method="post">

  <fieldset>

   <legend>회원정보</legend>


   <label for="uid">아이디&emsp;</label> 
   <input type="text" id="uid" name="id" maxlength="12" size="12" title="아이디 필수입력"> 
   <input type="button" value="중복확인">

   <br> 
   <br> 
   
   <label for="upw">비밀번호</label> <input type="password" id="upw" name="pass" maxlength="12" size="12"> <br>

   <br> 
   
   <label for="n">이메일</label> <input type="text" id="n" name="nid" maxlength="12" size="12" title="사용자님의 이메일을 입력해주세요"> 
   <label for="n">@</label> 
   <input type="text" id="n" name="nid" maxlength="12" size="12"  title="사용자님의 이메일을 입력해주세요" > 
   <br>
   <br>

   <label for="userAddr">주소</label>

    <select id="userAddr">

     <optgroup label="서울특별시">

     <option value="gangnam-gu">강남구</option>

     <option value="seocho-gu">서초구</option>

     <option value="gangseo-gu">강서구</option>

     <option value="yangcheon-gu">양천구</option>

     </optgroup>

     

     <optgroup label="광역시">

       <option value="pusan">부산</option>

       <option value="daegu">대구</option>

       <option value="kwangju">광주</option>

       <option value="incheon">인천</option>

       <option value="daejeon">대전</option>

      </optgroup>

     </select>

   <br>

   

   <br>

    <label for="male">성별</label><br> <input type="radio"

    name="chk" id="male" value="남자">남자 <input type="radio"

    name="chk" value="여자">여자 <br> <br> <label

    for="pic">사진</label> <input type="button" id="pic" value="파일 선택">

   <label for="pic">선택된 파일 없음</label> <br> <br> <label

    for="cc">수신설정</label><br> <input type="checkbox" name="chkb"

    id="cc" value="메일 수신 허용">메일 수신 허용 <br> <input

    type="checkbox" name="chkb" value="SMS 수신 허용">SMS 수신 허용 

    <br>

   <br>

   

    <label for="ok">약관 동의</label><br>

   <iframe src="YAK.html" width="460" height="120"> </iframe><br>

   <input type="checkbox" name="chkb" id="ok" value="동의하겠습니다">

   동의하겠습니다 <br> <br> <br> <input type="submit" value="확인">




   <input type="reset" value="취소">







  </fieldset>

 </form>

 <br>



 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
<script type="text/javascript">
    $(function() {
        alert('body');
    });    
</script>
