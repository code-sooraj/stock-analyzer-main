CREATE TABLE STOCK (
    STOCK_ID              PRIMARY KEY
                          NOT NULL
                          UNIQUE,
    TICKER_SYMBOL VARCHAR NOT NULL
                          UNIQUE,
    STOCK_NAME    VARCHAR NOT NULL
                          UNIQUE
);

PRAGMA foreign_keys = 0;

CREATE TABLE sqlitestudio_temp_table AS SELECT *
                                          FROM STOCK;

DROP TABLE STOCK;

CREATE TABLE STOCK (
    STOCK_ID      INTEGER      PRIMARY KEY
                               NOT NULL
                               UNIQUE,
    TICKER_SYMBOL VARCHAR (7)  NOT NULL
                               UNIQUE,
    STOCK_NAME    VARCHAR (50) NOT NULL,
    EXCHANGE      VARCHAR (10) NOT NULL,
    COUNTRY_CODE  VARCHAR (2)  NOT NULL,
    CURRENCY_CODE VARCHAR (3)  NOT NULL,
    FOUNDED_YEAR  INTEGER
);

INSERT INTO STOCK (
                      STOCK_ID,
                      TICKER_SYMBOL,
                      STOCK_NAME
                  )
                  SELECT STOCK_ID,
                         TICKER_SYMBOL,
                         STOCK_NAME
                    FROM sqlitestudio_temp_table;

DROP TABLE sqlitestudio_temp_table;

PRAGMA foreign_keys = 1;

