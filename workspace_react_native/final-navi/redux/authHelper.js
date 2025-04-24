import { jwtDecode } from 'jwt-decode';

/* 
  ★ falsy ★ : null, undefined, 0, '', NaN, false
  truthy : true, {}, [], '0', 'false', -1, 1, 3.14, Symbol(), BigInt(0)

  기존 방식 (OR 연산자 사용) - 왼쪽 데이터가 falsy일 때 오른쪽 데이터 사용
  const username = user.name || 'Guest';

  Nullish 병합 연산자 사용 - 왼쪽 데이터가 null 또는 undefined일 때만 오른쪽 데이터 실행
  const nusename = user.name ?? 'Guest';
*/

//토큰에서 로그인한 회원 email 추출
//토큰에서 Email 못 빼면 리턴 null, 있으면 email 
export const getUserSubFromToken = (token) => {
  if (!token) {
    console.log('토큰이 없습니다.');
    return null;
  }

  try {
    const decoded = jwtDecode(token);
    return decoded?.sub || null;
  } catch (error) {
    console.log('jwtDecode 실패:', error);
    return null;
  }
};

export const getUserRoleFromToken = (token) => {
  if (!token) return null;

  try {
    const decoded = jwtDecode(token);

    // ? : 옵셔럴 체이닝 연산자
    // decoded가 null 또는 undefined -> undefined
    return decoded?.role || null; 
  } catch (error) {
    console.log('jwtDecode 실패:', error);
    return null;
  }
};