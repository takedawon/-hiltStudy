package com.example.study.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.study.R
import com.example.study.base.BaseFragment
import com.example.study.databinding.FragmentTravelDetailBinding
import com.example.study.util.EventObserver
import com.example.study.util.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TravelDetailFragment : BaseFragment<FragmentTravelDetailBinding>(
    layoutRes = R.layout.fragment_travel_detail
) {

    private val mainViewModel: TestViewModel by activityViewModels() // 테스트
    private val travelViewModel: TravelViewModel by viewModels()
    private val travelAdapter: TravelAdapter by lazy { TravelAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = travelViewModel

        travelViewModel.goToOrderDetails.observe(viewLifecycleOwner, EventObserver {
            toast("메뉴")
        })

        travelViewModel.daram.observe(viewLifecycleOwner, EventObserver {
            toast("다람")
        })

        travelViewModel.a.observe(viewLifecycleOwner, EventObserver {
            toast("a")
        })

        travelViewModel.b.observe(viewLifecycleOwner, EventObserver {
            toast("b")
        })

        travelViewModel.c.observe(viewLifecycleOwner, EventObserver {
            toast("c")
        })
    }
}
