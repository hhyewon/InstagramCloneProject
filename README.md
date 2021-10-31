# 📌 Instagram clone project✨
> 꾸준히 열심히 하며 크게 꿈 꾸기😎

## 👩🏻‍💻 Team
| 역할 | 이름 | 
| :---: | :----: |
| AOS | [양혜원](https://github.com/hhyewon) | 
| 서버 | [신윤지](https://github.com/KSYoonji) |

<br />

## 💌 ERD & API Sheet    
> ### [Instagram API](https://docs.google.com/spreadsheets/d/1Zj9YN4jroKDGlW3W5ODteqsv8G1qOXWY/edit#gid=990061567)     
> ### [ERD URL](https://aquerytool.com/aquerymain/index/?rurl=73a176e1-bc7c-4a04-8531-d5aa169be98b&)     
>> 🔑 Password : da430a

<br />

## 🚀 Structure

```
instagram-clone-project
> app
  > mainfest
  > java
    > com
      > config    //근간이 되는 코드
        | ApplicationClass    // 전역변수와 앱이 실행될 동안 한 번만 유지되어야 하는 객체(싱긑톤)
        | BaseActivity or BaseFragment    //액티비티 혹은 프래그먼트의 기본을 작성(뷰 바인딩 활용), 상속받아서 사용
        | BaseResponse // 반복되는 Response 내용 중복을 줄이기 위해 사용. Response 데이터 클래스를 만들때 상속해서 사용
        | XAccessTokenInterceptor    // 최초 로그인 시에 서버에서 발급해주는 jwt를 저장해 놓기
      > src    //근간을 이용해 구현된 코드들. 도메인별로 폴더 나눔(화면 별)
        > models    // 데이터의 형식만 작성
        | Service   // 네트워크를 담당하는 코드 작성
        | RetrofitInterface
        | View   // 뷰를 통해 프레그먼트와 서비스가 서로 데이터를 주고 받음
        | Fragment or Activity   // 요청을 보내는 형태로 작성
      > util    //도구처럼 사용되는 코드

- mvp 디자인 패턴을 기반
- id는 (도메인)_(버튼)_(어떤걸 하는지) 형식으로 작성
```
# 📌 Plan & Goal
## 📃 Plan
> _2021/10/18(월) ~ 2021/11/29(월)_     
````
 1) 오프라인 스터디 일정: 주 1회 (매주 월)    
   2-1) 현재 진행상황 공유
   2-2) 이슈 공유
   2-3) 매주 목표 설정(계획 업데이트)
 2) 개발일지 작성하기
````
<br />

## 🏆 _Goal_
- [ ] 피드
- [ ] 내 게시물
- [ ] 검색
- [ ] 스토리 
<br />


# 📌 주차별 목표 작업 범위 및 일정
### 💬 [1주차]    
> _10/18 ~ 10/24_
- [x] 뼈대 레이아웃 구성
- [x] 이미지 리소스 구하기


### 💬 [2주차]    
> _10/25 ~ 10/31_
- [ ] 로그인 레이아웃 및 API
- [ ] 회원가입 레이아웃 및 API
- [ ] 자동 로그인 
<br />

# 📌 개발일지
## 2021년 10월 18일 (월) 🌧 [오프라인]
- 프로젝트 세부 계획 세우기
- 팀원과의 일정 조율 및 구체적 목표 수립
- 템플릿 적응하기

## 2021년 10월 19일 (화) 🌬
- 바텀 네비게이션 (10% ✔)

## 2021년 10월 23일 (토) 🌞
- 바텀 네비게이션 (100% ✔)
- 이미지 리소스 구하기 (100% ✔)
- 템플릿 Structure 

## 2021년 10월 25일 (월) [오프라인]
- 이번주 목표 짜기



## 2021년 10월 30일 (토)
- 로그인 레이아웃 ( 80% )


