package com.crlandpm.moduleaa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.crlandpm.module_export.ARouterTable

/**
 * Author: Danny Yang
 * Date: 2022/02/22/2:38 下午
 */
@Route(path = ARouterTable.PATH_A)
class ModuleaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_a)
    }
}