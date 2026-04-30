```mermaid
graph LR
    %% Actors
    Customer((고객))
    Admin((관리자))

    %% System Boundary
    subgraph "항공 예약 시스템"
        %% Customer Management
        UC_Register([고객등록])
        UC_Inquiry([고객조회])
        UC_Auth([고객인증])
        UC_Mileage([마일리지조회])

        %% Ticket Management
        UC_T_Reg([항공권등록])
        UC_T_Inq([항공권조회])
        UC_T_Price([항공권가격조회])

        %% Reservation & Purchase
        UC_Reserve([예약])
        UC_Res_Inq([예약조회])
        UC_Purchase([구매])
    end

    %% Actor Relationships
    Customer --- UC_Register
    Customer --- UC_Inquiry
    Customer --- UC_Mileage
    Customer --- UC_T_Inq
    Customer --- UC_T_Price
    Customer --- UC_Reserve
    Customer --- UC_Res_Inq
    Customer --- UC_Purchase

    Admin --- UC_T_Reg

    %% Include Relationships (비즈니스 로직 반영)
    %% [예약] 필수 조건: 고객인증, 항공권조회
    UC_Reserve -. "<<include>>" .-> UC_Auth
    UC_Reserve -. "<<include>>" .-> UC_T_Inq

    %% [구매] 필수 조건: 고객인증, 예약조회, 마일리지조회
    UC_Purchase -. "<<include>>" .-> UC_Auth
    UC_Purchase -. "<<include>>" .-> UC_Res_Inq
    UC_Purchase -. "<<include>>" .-> UC_Mileage