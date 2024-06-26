package com.sparta.shop_sparta.domain.dto.cart;

import com.sparta.shop_sparta.domain.entity.cart.CartEntity;
import com.sparta.shop_sparta.constant.cart.CartStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartDto {
    private Long cartId;
    private CartStatus cartStatus;
    private Long memberId;

    public CartEntity toEntity(){
        return CartEntity.builder().cartId(this.cartId).cartStatus(this.cartStatus).build();
    }
}
