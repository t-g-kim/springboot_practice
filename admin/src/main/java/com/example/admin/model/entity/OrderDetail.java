package com.example.admin.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@ToString(exclude = {"user", "item"})   //toString 때문에 overflow가 생긴다. orderdetail과 user가 상호참조
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    private LocalDateTime arrival_date;

    private Integer quantity;

    private BigDecimal totalPrice;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

    private Long itemId;

    private Long orderGroupId;

//    // N:1
//    @ManyToOne
//    private User user;  // hibernate를 통한 연관관계를 설정시 객체 이름을 사용해야함
//
//    // N:1
//    @ManyToOne
//    private Item item;

}
