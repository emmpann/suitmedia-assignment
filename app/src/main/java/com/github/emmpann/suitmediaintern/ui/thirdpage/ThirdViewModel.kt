package com.github.emmpann.suitmediaintern.ui.thirdpage

import androidx.lifecycle.ViewModel
import com.github.emmpann.suitmediaintern.data.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ThirdViewModel @Inject constructor(
    private val userRepository: UserRepository,
) : ViewModel() {
//    val user: LiveData<PagingData<DataItem>> =
//        userRepository.getAllUser().cachedIn(viewModelScope)

    fun getUsers(perPage: Int) = userRepository.getAllUser(perPage)
}