package cn.inter;

import cn.entity.MobileCard;

public interface CallService {
    int call(   int minCount,MobileCard card) throws Exception ;
}
