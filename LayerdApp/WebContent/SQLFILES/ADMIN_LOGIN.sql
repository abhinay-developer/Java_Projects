--------------------------------------------------------
--  File created - Saturday-May-09-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ADMIN_LOGIN
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."ADMIN_LOGIN" 
   (	"ID" NUMBER, 
	"USERNAME" VARCHAR2(20 BYTE), 
	"PASSWORD" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SYSTEM.ADMIN_LOGIN
SET DEFINE OFF;
Insert into SYSTEM.ADMIN_LOGIN (ID,USERNAME,PASSWORD) values (1,'abhi','12345');
--------------------------------------------------------
--  DDL for Index ADMIN_LOGIN_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."ADMIN_LOGIN_PK" ON "SYSTEM"."ADMIN_LOGIN" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Trigger ADMIN_LOGIN_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "SYSTEM"."ADMIN_LOGIN_TRG" 
BEFORE INSERT ON ADMIN_LOGIN 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.ID IS NULL THEN
      SELECT ADMIN_LOGIN_SEQ.NEXTVAL INTO :NEW.ID FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SYSTEM"."ADMIN_LOGIN_TRG" ENABLE;
--------------------------------------------------------
--  Constraints for Table ADMIN_LOGIN
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."ADMIN_LOGIN" ADD CONSTRAINT "ADMIN_LOGIN_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."ADMIN_LOGIN" MODIFY ("ID" NOT NULL ENABLE);
