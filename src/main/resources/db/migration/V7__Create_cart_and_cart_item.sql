create table CART ( ID int(10) PRIMARY KEY);
create table CARTITEM ( ID int(10) PRIMARY KEY,QUANTITY int(10) not null,CART_ID int(10) not null,ITEM_ID int(10) not null );
alter table CARTITEM ADD FOREIGN KEY (CART_ID) references CART(ID);
alter table CARTITEM ADD FOREIGN KEY (ITEM_ID) references ITEM(ID);
create table CART_CART_ITEM ( CART_ID int(10) not null,CART_ITEM_ID int(10) not null );
alter table CART_CART_ITEM ADD FOREIGN KEY (CART_ID) references CART(ID);
alter table CART_CART_ITEM ADD UNIQUE KEY (CART_ITEM_ID);
