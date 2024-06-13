SELECT TABLE_NAME
FROM information_schema.TABLES
WHERE TABLE_SCHEMA = 'lonco'
  AND TABLE_NAME LIKE 't5_%'
;

select * from USER;
select * from AUTHORITY;
select * from USER_AUTHORITY;
select * from CLUB;
select * from CLUB_USER_LIST;
select * from BOARD_TYPE;
select * from BOARD;
select * from BOARD_LIKE;
select * from ATTACHMENT;
select * from ATTACHMENT_LIKE;
select * from COMMENT;
select * from VENUE;
select * from RESERVATION;
select * from SOCIALIZING;
select * from USER_SOCIALIZING;

select u.user_id, a.name
    from user_authority u,
         AUTHORITY a
where u.authority_id = a.id;


