# π Instagram clone projectβ¨
> κΎΈμ€ν μ΄μ¬ν νλ©° ν¬κ² κΏ κΎΈκΈ°π

## π©π»βπ» Team
| μ­ν  | μ΄λ¦ | 
| :---: | :----: |
| AOS | [μνμ](https://github.com/hhyewon) | 
| μλ² | [μ μ€μ§](https://github.com/KSYoonji) |

<br />

## π ERD & API Sheet    
> ### [Instagram API](https://docs.google.com/spreadsheets/d/1Zj9YN4jroKDGlW3W5ODteqsv8G1qOXWY/edit#gid=990061567)     
> ### [ERD URL](https://aquerytool.com/aquerymain/index/?rurl=73a176e1-bc7c-4a04-8531-d5aa169be98b&)     
>> π Password : da430a

<br />

## π Structure

```
instagram-clone-project
> app
  > mainfest
  > java
    > com
      > config    //κ·Όκ°μ΄ λλ μ½λ
        | ApplicationClass    // μ μ­λ³μμ μ±μ΄ μ€νλ  λμ ν λ²λ§ μ μ§λμ΄μΌ νλ κ°μ²΄(μ±κΈν€)
        | BaseActivity or BaseFragment    //μ‘ν°λΉν° νΉμ νλκ·Έλ¨ΌνΈμ κΈ°λ³Έμ μμ±(λ·° λ°μΈλ© νμ©), μμλ°μμ μ¬μ©
        | BaseResponse // λ°λ³΅λλ Response λ΄μ© μ€λ³΅μ μ€μ΄κΈ° μν΄ μ¬μ©. Response λ°μ΄ν° ν΄λμ€λ₯Ό λ§λ€λ μμν΄μ μ¬μ©
        | XAccessTokenInterceptor    // μ΅μ΄ λ‘κ·ΈμΈ μμ μλ²μμ λ°κΈν΄μ£Όλ jwtλ₯Ό μ μ₯ν΄ λκΈ°
      > src    //κ·Όκ°μ μ΄μ©ν΄ κ΅¬νλ μ½λλ€. λλ©μΈλ³λ‘ ν΄λ λλ(νλ©΄ λ³)
        > models    // λ°μ΄ν°μ νμλ§ μμ±
        | Service   // λ€νΈμν¬λ₯Ό λ΄λΉνλ μ½λ μμ±
        | RetrofitInterface
        | View   // λ·°λ₯Ό ν΅ν΄ νλ κ·Έλ¨ΌνΈμ μλΉμ€κ° μλ‘ λ°μ΄ν°λ₯Ό μ£Όκ³  λ°μ
        | Fragment or Activity   // μμ²­μ λ³΄λ΄λ ννλ‘ μμ±
      > util    //λκ΅¬μ²λΌ μ¬μ©λλ μ½λ

- mvp λμμΈ ν¨ν΄μ κΈ°λ°
- idλ (λλ©μΈ)_(λ²νΌ)_(μ΄λ€κ±Έ νλμ§) νμμΌλ‘ μμ±
```
# π Plan & Goal
## π Plan
> _2021/10/18(μ) ~ 2021/11/29(μ)_     
````
 1) μ€νλΌμΈ μ€ν°λ μΌμ : μ£Ό 1ν (λ§€μ£Ό μ)    
   1-1) νμ¬ μ§νμν© κ³΅μ 
   1-2) μ΄μ κ³΅μ 
   1-3) λ§€μ£Ό λͺ©ν μ€μ (κ³ν μλ°μ΄νΈ)
 2) κ°λ°μΌμ§ μμ±νκΈ°
````
<br />

## π _Goal_
- [ ] νΌλ
- [ ] λ΄ κ²μλ¬Ό
- [ ] κ²μ
- [ ] μ€ν λ¦¬ 
<br />


# π μ£Όμ°¨λ³ λͺ©ν μμ λ²μ λ° μΌμ 
### π¬ [1μ£Όμ°¨]    
> _10/18 ~ 10/24_
- [x] λΌλ λ μ΄μμ κ΅¬μ±
- [x] μ΄λ―Έμ§ λ¦¬μμ€ κ΅¬νκΈ°


### π¬ [2μ£Όμ°¨]    
> _10/25 ~ 10/31_
- [x] λ‘κ·ΈμΈ λ μ΄μμ λ° API
- [x] νμκ°μ λ μ΄μμ λ° API
- [ ] μλ λ‘κ·ΈμΈ 
<br />

### π¬ [3μ£Όμ°¨]    
> _11/01 ~ 11/7_ >> [μ°μ₯] >> 11/10 κΉμ§ μλ£νκΈ°
- [ ] λ§μ΄νμ΄μ§ λ μ΄μμ λ° API
- [ ] μλ λ‘κ·ΈμΈ 
- [ ] μ  μ£Ό μμ λͺ»ν λΆλΆ λ³΄μνκΈ°
<br />

### π¬ [4μ£Όμ°¨]    
> _11/11 ~ 11/14_
- [ ] νλ‘μ / νλ‘μ νμ΄μ§ μμ

# π κ°λ°μΌμ§
## 2021λ 10μ 18μΌ (μ) π§ [μ€νλΌμΈ]
- νλ‘μ νΈ μΈλΆ κ³ν μΈμ°κΈ°
- νμκ³Όμ μΌμ  μ‘°μ¨ λ° κ΅¬μ²΄μ  λͺ©ν μλ¦½
- ννλ¦Ώ μ μνκΈ°

## 2021λ 10μ 19μΌ (ν) π¬
- λ°ν λ€λΉκ²μ΄μ (10% β)

## 2021λ 10μ 23μΌ (ν ) π
- λ°ν λ€λΉκ²μ΄μ (100% β)
- μ΄λ―Έμ§ λ¦¬μμ€ κ΅¬νκΈ° (100% β)
- ννλ¦Ώ Structure 

## 2021λ 10μ 25μΌ (μ) [μ€νλΌμΈ]
- μ΄λ²μ£Ό λͺ©ν μ§κΈ°

## 2021λ 10μ 30μΌ (ν )
- λ‘κ·ΈμΈ λ‘μ§ λ μ΄μμ ( 80% )

## 2021λ 10μ 31μΌ (μ)
- νμκ°μ λ‘μ§ λ μ΄μμ ( 80% )

## 2021λ 11μ 1μΌ (μ) [μ€νλΌμΈ]
- μ΄λ²μ£Ό λͺ©ν μ§κΈ°

## 2021λ 11μ 6μΌ (ν )
- λ§μ΄νμ΄μ§ λ μ΄μμ ( 50% )

## 2021λ 11μ 8μΌ (μ) [μ€νλΌμΈ]
- μ΄λ²μ£Ό λͺ©ν μ§κΈ°



