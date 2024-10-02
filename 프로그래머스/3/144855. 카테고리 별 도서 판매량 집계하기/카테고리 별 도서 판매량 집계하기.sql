SELECT B.CATEGORY, SUM(S.SALES) AS TOTAL_SALES FROM BOOK_SALES S INNER JOIN BOOK B ON B.BOOK_ID = S.BOOK_ID WHERE S.SALES_DATE LIKE '2022-01%' GROUP BY B.CATEGORY ORDER BY CATEGORY;