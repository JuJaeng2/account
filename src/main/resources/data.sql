insert into account_user(id, name, created_at, updated_at)
values (1, 'Pororo', now(), now());
insert into account_user(id, name, created_at, updated_at)
values (2, 'Lupi', now(), now());
insert into account_user(id, name, created_at, updated_at)
values (3, 'Pobi', now(), now());

-- application.yml 파일에서 jpa부분에 defer-datasource-initialization: true 값이 들어가야 정상적으로 작동한다.
-- 없으면 테이블을 생성하기 전에 데이터 삽입과정이 먼저 수행되어서 오류 발생