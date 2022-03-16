# springboot-jpa-keycat

## 궁금한 이야기들

### 엔티티 설계

- 단방향/양방향 연관관계
- 연관관계의 주인 설정 - 영속성 컨텍스트 업데이트 과정
- JPA 프록시와 리플렉션
  - 디폴트 생성자를 통한 활용.
  - protected 접근 제한자.

### 도메인 개발

- Transactional(readonly = true)로 명시했을 때의 이점
- 테스트코드에서 Transactional의 디폴트 설정
  - rollback = true
  - entityManager가 flush하지 않음.
- PersistenceContext 어노테이션이 하던 일
  - Spring Data JPA에서 지원하는 DI로 충분한 이유

### 테스트코드

- 테스트 실행 컨텍스트 (<code>@RunWith</code>, <code>@SpringBootTest</code>)

### 그 외

- Transactional 프록시 동작원리
  - private 메소드에 Transactional 어노테이션을 붙일 수 없다.
  - 프록시 패턴을 활용하기 때문에, Override 가능한 메소드에만 적용 가능한 것으로 보임.
  - 이전에 리뷰받은 self-invocation 문제.

## 참고

> <a href="https://inf.run/5vqa">실전! 스프링 부트와 JPA 활용1 - 웹 애플리케이션 개발</a>
