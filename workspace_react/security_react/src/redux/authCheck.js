import { jwtDecode } from "jwt-decode";

//만료 됐는지 ? 
export const isTokenExpired = (token) => {
  const decodedToken = jwtDecode(token);
  const currentTime = Date.now() / 1000; // 현재 시간 (초 단위)

  return decodedToken.exp < currentTime; // 만료된 경우 true 반환
}

//로그인 여부
export const isAuthenticated = (token) => {
    if(!token) return false;
    if(isTokenExpired(token)) {
      localStorage.removeItem('accessToken');
      return false;
    }

    return true;
}

//로그인 및 관리자 여부
export const isAdmin = (token) => {
  if(!isAuthenticated(token)) return false;

  const decodedToken = jwtDecode(token);

  return decodedToken.role === 'ROLE_ADMIN'

}










// import { jwtDecode } from "jwt-decode"; // //jwt-decode 라이브러리 사용

// //만료 됐는지 ? 
// export const isTokenExpired = (token) => { // 토큰이 인증되면 true 반환
//   const decodedToken = jwtDecode(token);
//   const currentTime = Date.now() / 1000; // 현재 시간 (초 단위)

//   return decodedToken.exp < currentTime; // 만료된 경우 true 반환
// }

// //로그인 여부
// export const isAuthenticated = (token) => { // 토큰이 인증되면 true 반환
//     if(!token) return false; // // 토큰이 없으면 false 반환
//     if(isTokenExpired(token)) { // // 토큰이 만료되면 false 반환
//       localStorage.removeItem('accessToken'); // // 로컬 스토리지에서 accessToken 삭제
//       return false; // // false 반환
//     }

//     return true; // // 인증된 경우 true 반환
// }

// //로그인 및 관리자 여부
// export const isAdmin = (token) => { 
//   if(!isAuthenticated(token)) return false; // 로그인이 안됐으면 false 반환 , 관리자판단은 인증부터 체크 함

//   const decodedToken = jwtDecode(token);

//   return decodedToken.role === 'ROLE_ADMIN'

// }