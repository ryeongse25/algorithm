def solution(chicken):
    coupon = chicken
    service = 0
    
    while coupon >= 10:
        tmp_service = coupon // 10
        service += tmp_service
        coupon = coupon % 10
        coupon += tmp_service
    
    return service
        