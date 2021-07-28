package com.example.openfoodfactesgi.mapper

import android.util.Log
import com.example.openfoodfactesgi.dto.DTOSuccess
import com.example.openfoodfactesgi.models.SuccessModel

class SuccessMapper {
    companion object {
        fun mapsuccessModelList(successDTOList: List<DTOSuccess?>?): List<SuccessModel> {
            val successModelList: MutableList<SuccessModel> = ArrayList<SuccessModel>()

            if (successDTOList != null) {
                for (successDTO in successDTOList) {
                    successModelList.add(mapsuccessModel(successDTO))
                }
            }
            return successModelList
        }

        private fun mapsuccessModel(successDTO: DTOSuccess?): SuccessModel {
            return SuccessModel(
                successDTO?.idSuccess,
                successDTO?.name,
                successDTO?.description,
                successDTO?.image
            )
        }
    }
}