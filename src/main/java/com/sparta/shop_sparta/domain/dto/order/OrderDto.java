package com.sparta.shop_sparta.domain.dto.order;

import com.sparta.shop_sparta.domain.entity.order.OrderEntity;
import com.sparta.shop_sparta.constant.order.OrderStatus;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {
    private Long orderId;
    private String order_addr;
    private Long memberId;
    private OrderStatus orderStatus;
    @Builder.Default
    private List<OrderDetailDto> orderDetailDTOList = new ArrayList<>();

    public OrderEntity toEntity(){
        return OrderEntity.builder().orderId(this.orderId).order_addr(this.order_addr).orderStatus(this.orderStatus).build();
    }
}
