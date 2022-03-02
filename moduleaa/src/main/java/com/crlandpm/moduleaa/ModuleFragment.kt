package com.crlandpm.moduleaa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.crlandpm.module_export.ARouterTable

/**
 * Author: Danny Yang
 * Date: 2022/02/22/2:46 下午
 */

@Route(path = ARouterTable.PAth_FRAGMENT_A)
class ModuleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

}