package com.crlandpm.moduleaa

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.crlandpm.module_export.AInfo
import com.crlandpm.module_export.ARouterTable
import com.crlandpm.module_export.AService

/**
 * Author: Danny Yang
 * Date: 2022/03/02/8:10 下午
 */
@Route(path = ARouterTable.PATH_SERVICE_A)
class AServiceImp: AService {
    override fun getTips(): AInfo {
        var info = AInfo()
        info.tips = "i am a cat"
        return info
    }

    override fun init(context: Context?) {

    }
}