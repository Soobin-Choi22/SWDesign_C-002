```mermaid

graph LR

&#x20;   %% Actors

&#x20;   Customer((고객))

&#x20;   Admin((관리자))



&#x20;   %% System Boundary / Subgraphs

&#x20;   subgraph 고객\_관리\_기능

&#x20;       UC1(\[고객등록])

&#x20;       UC2(\[고객조회])

&#x20;       UC3(\[고객인증])

&#x20;       UC4(\[마일리지조회])

&#x20;   end



&#x20;   subgraph 항공권\_관리\_기능

&#x20;       UC5(\[항공권등록])

&#x20;       UC6(\[항공권조회])

&#x20;       UC7(\[항공권가격조회])

&#x20;   end



&#x20;   subgraph 예약\_및\_구매\_기능

&#x20;       UC8(\[예약])

&#x20;       UC9(\[예약조회])

&#x20;       UC10(\[구매])

&#x20;   end



&#x20;   %% Actor to Use Case Connections (Association)

&#x20;   Customer --- UC1

&#x20;   Customer --- UC2

&#x20;   Customer --- UC4

&#x20;   Customer --- UC6

&#x20;   Customer --- UC7

&#x20;   Customer --- UC8

&#x20;   Customer --- UC9

&#x20;   Customer --- UC10

&#x20;   

&#x20;   %% Admin normally registers tickets

&#x20;   Admin --- UC5



&#x20;   %% Include Relationships (필수 조건)

&#x20;   %% 1. 예약은 반드시 고객인증, 항공권조회를 해야 함

&#x20;   UC8 -. "<<include>>" .-> UC3

&#x20;   UC8 -. "<<include>>" .-> UC6



&#x20;   %% 2. 구매는 반드시 고객인증, 예약조회, 마일리지조회를 해야 함

&#x20;   UC10 -. "<<include>>" .-> UC3

&#x20;   UC10 -. "<<include>>" .-> UC9

&#x20;   UC10 -. "<<include>>" .-> UC4



&#x20;   %% 다이어그램 스타일 설정

&#x20;   classDef default fill:#f9f9f9,stroke:#333,stroke-width:2px;

&#x20;   classDef include stroke-dasharray: 5 5;

