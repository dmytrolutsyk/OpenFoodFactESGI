// To parse the SerializedName, install Klaxon and do:
//
//   val Products = Products.fromSerializedName(SerializedNameString)

package com.example.openfoodfactesgi.services

import com.google.gson.annotations.SerializedName

data class Product (
    @SerializedName("_id")
    val id: String,

    @SerializedName("_keywords")
    val keywords: List<String>,

    @SerializedName("added_countries_tags")
    val addedCountriesTags: List<Any?>,

    @SerializedName("additives_debug_tags")
    val additivesDebugTags: List<Any?>,

    @SerializedName("additives_n")
    val additivesN: Long,

    @SerializedName("additives_old_n")
    val additivesOldN: Long,

    @SerializedName("additives_old_tags")
    val additivesOldTags: List<String>,

    @SerializedName("additives_original_tags")
    val additivesOriginalTags: List<String>,

    @SerializedName("additives_prev_original_tags")
    val additivesPrevOriginalTags: List<String>,

    @SerializedName("additives_tags")
    val additivesTags: List<String>,

    @SerializedName("additives_tags_n")
    val additivesTagsN: Any? = null,

    val allergens: String,

    @SerializedName("allergens_from_ingredients")
    val allergensFromIngredients: String,

    @SerializedName("allergens_from_user")
    val allergensFromUser: String,

    @SerializedName("allergens_hierarchy")
    val allergensHierarchy: List<Any?>,

    @SerializedName("allergens_tags")
    val allergensTags: List<Any?>,

    @SerializedName("amino_acids_prev_tags")
    val aminoAcidsPrevTags: List<Any?>,

    @SerializedName("amino_acids_tags")
    val aminoAcidsTags: List<Any?>,

    @SerializedName("brand_owner")
    val brandOwner: String,

    @SerializedName("brand_owner_imported")
    val brandOwnerImported: String,

    val brands: String,

    @SerializedName("brands_debug_tags")
    val brandsDebugTags: List<Any?>,

    @SerializedName("brands_tags")
    val brandsTags: List<String>,

    val categories: String,

    @SerializedName("categories_hierarchy")
    val categoriesHierarchy: List<String>,

    @SerializedName("categories_imported")
    val categoriesImported: String,

    @SerializedName("categories_lc")
    val categoriesLc: String,

    @SerializedName("categories_old")
    val categoriesOld: String,

    @SerializedName("categories_properties_tags")
    val categoriesPropertiesTags: List<String>,

    @SerializedName("categories_tags")
    val categoriesTags: List<String>,


    val checkers: List<Any?>,

    @SerializedName("checkers_tags")
    val checkersTags: List<Any?>,

    @SerializedName("ciqual_food_name_tags")
    val ciqualFoodNameTags: List<String>,

    @SerializedName("cities_tags")
    val citiesTags: List<Any?>,

    val code: String,

    @SerializedName("codes_tags")
    val codesTags: List<String>,

    @SerializedName("compared_to_category")
    val comparedToCategory: String,

    val complete: Long,

    @SerializedName("completed_t")
    val completedT: Long,

    val completeness: Double,
    val correctors: List<String>,

    @SerializedName("correctors_tags")
    val correctorsTags: List<String>,

    val countries: String,

    @SerializedName("countries_debug_tags")
    val countriesDebugTags: List<Any?>,

    @SerializedName("countries_hierarchy")
    val countriesHierarchy: List<String>,

    @SerializedName("countries_imported")
    val countriesImported: String,

    @SerializedName("countries_lc")
    val countriesLc: String,

    @SerializedName("countries_tags")
    val countriesTags: List<String>,

    @SerializedName("created_t")
    val createdT: Long,

    val creator: String,

    @SerializedName("data_quality_bugs_tags")
    val dataQualityBugsTags: List<Any?>,

    @SerializedName("data_quality_errors_tags")
    val dataQualityErrorsTags: List<Any?>,

    @SerializedName("data_quality_info_tags")
    val dataQualityInfoTags: List<String>,

    @SerializedName("data_quality_tags")
    val dataQualityTags: List<String>,

    @SerializedName("data_quality_warnings_tags")
    val dataQualityWarningsTags: List<String>,

    @SerializedName("data_sources")
    val dataSources: String,

    @SerializedName("data_sources_imported")
    val dataSourcesImported: String,

    @SerializedName("data_sources_tags")
    val dataSourcesTags: List<String>,

    @SerializedName("debug_param_sorted_langs")
    val debugParamSortedLangs: List<String>,

    @SerializedName("ecoscore_data")
    val ecoscoreData: EcoscoreData,

    @SerializedName("ecoscore_grade")
    val ecoscoreGrade: String,

    @SerializedName("ecoscore_tags")
    val ecoscoreTags: List<String>,

    val editors: List<String>,

    @SerializedName("editors_tags")
    val editorsTags: List<String>,

    @SerializedName("emb_codes")
    val embCodes: String,

    @SerializedName("emb_codes_20141016")
    val embCodes20141016: String,

    @SerializedName("emb_codes_debug_tags")
    val embCodesDebugTags: List<Any?>,

    @SerializedName("emb_codes_orig")
    val embCodesOrig: String,

    @SerializedName("emb_codes_tags")
    val embCodesTags: List<Any?>,

    @SerializedName("entry_dates_tags")
    val entryDatesTags: List<String>,

    @SerializedName("expiration_date")
    val expirationDate: String,

    @SerializedName("expiration_date_debug_tags")
    val expirationDateDebugTags: List<Any?>,

    @SerializedName("fruits-vegetables-nuts_100g_estimate")
    val fruitsVegetablesNuts100GEstimate: Long,

    @SerializedName("generic_name")
    val genericName: String,

    @SerializedName("generic_name_en")
    val genericNameEn: String,

    @SerializedName("generic_name_en_debug_tags")
    val genericNameEnDebugTags: List<Any?>,

    @SerializedName("id")
    val productID: String,

    @SerializedName("image_front_small_url")
    val imageFrontSmallURL: String,

    @SerializedName("image_front_thumb_url")
    val imageFrontThumbURL: String,

    @SerializedName("image_front_url")
    val imageFrontURL: String,

    @SerializedName("image_ingredients_small_url")
    val imageIngredientsSmallURL: String,

    @SerializedName("image_ingredients_thumb_url")
    val imageIngredientsThumbURL: String,

    @SerializedName("image_ingredients_url")
    val imageIngredientsURL: String,

    @SerializedName("image_nutrition_small_url")
    val imageNutritionSmallURL: String,

    @SerializedName("image_nutrition_thumb_url")
    val imageNutritionThumbURL: String,

    @SerializedName("image_nutrition_url")
    val imageNutritionURL: String,

    @SerializedName("image_small_url")
    val imageSmallURL: String,

    @SerializedName("image_thumb_url")
    val imageThumbURL: String,

    @SerializedName("image_url")
    val imageURL: String,

    val images: Images,
    val informers: List<String>,

    @SerializedName("informers_tags")
    val informersTags: List<String>,

    val ingredients: List<Ingredient>,

    @SerializedName("ingredients_analysis_tags")
    val ingredientsAnalysisTags: List<String>,

    @SerializedName("ingredients_debug")
    val ingredientsDebug: List<String?>,

    @SerializedName("ingredients_from_or_that_may_be_from_palm_oil_n")
    val ingredientsFromOrThatMayBeFromPalmOilN: Long,

    @SerializedName("ingredients_from_palm_oil_n")
    val ingredientsFromPalmOilN: Long,

    @SerializedName("ingredients_from_palm_oil_tags")
    val ingredientsFromPalmOilTags: List<Any?>,

    @SerializedName("ingredients_hierarchy")
    val ingredientsHierarchy: List<String>,

    @SerializedName("ingredients_ids_debug")
    val ingredientsIDSDebug: List<String>,

    @SerializedName("ingredients_n")
    val ingredientsN: Long,

    @SerializedName("ingredients_n_tags")
    val ingredientsNTags: List<String>,

    @SerializedName("ingredients_original_tags")
    val ingredientsOriginalTags: List<String>,

    @SerializedName("ingredients_percent_analysis")
    val ingredientsPercentAnalysis: Long,

    @SerializedName("ingredients_tags")
    val ingredientsTags: List<String>,

    @SerializedName("ingredients_text")
    val ingredientsText: String,

    @SerializedName("ingredients_text_debug")
    val ingredientsTextDebug: String,

    @SerializedName("ingredients_text_en")
    val ingredientsTextEn: String,

    @SerializedName("ingredients_text_en_debug_tags")
    val ingredientsTextEnDebugTags: List<Any?>,

    @SerializedName("ingredients_text_en_imported")
    val ingredientsTextEnImported: String,

    @SerializedName("ingredients_text_with_allergens")
    val ingredientsTextWithAllergens: String,

    @SerializedName("ingredients_text_with_allergens_en")
    val ingredientsTextWithAllergensEn: String,

    @SerializedName("ingredients_that_may_be_from_palm_oil_n")
    val ingredientsThatMayBeFromPalmOilN: Long,

    @SerializedName("ingredients_that_may_be_from_palm_oil_tags")
    val ingredientsThatMayBeFromPalmOilTags: List<Any?>,

    @SerializedName("interface_version_created")
    val interfaceVersionCreated: String,

    @SerializedName("interface_version_modified")
    val interfaceVersionModified: String,

    @SerializedName("known_ingredients_n")
    val knownIngredientsN: Long,

    val labels: String,

    @SerializedName("labels_hierarchy")
    val labelsHierarchy: List<String>,

    @SerializedName("labels_lc")
    val labelsLc: String,

    @SerializedName("labels_old")
    val labelsOld: String,

    @SerializedName("labels_tags")
    val labelsTags: List<String>,

    val lang: String,

    @SerializedName("lang_debug_tags")
    val langDebugTags: List<Any?>,

    val languages: Languages,

    @SerializedName("languages_codes")
    val languagesCodes: LanguagesCodes,

    @SerializedName("languages_hierarchy")
    val languagesHierarchy: List<String>,

    @SerializedName("languages_tags")
    val languagesTags: List<String>,

    @SerializedName("last_edit_dates_tags")
    val lastEditDatesTags: List<String>,

    @SerializedName("last_editor")
    val lastEditor: String,

    @SerializedName("last_image_dates_tags")
    val lastImageDatesTags: List<String>,

    @SerializedName("last_image_t")
    val lastImageT: Long,

    @SerializedName("last_modified_by")
    val lastModifiedBy: String,

    @SerializedName("last_modified_t")
    val lastModifiedT: Long,

    val lc: String,

    @SerializedName("lc_imported")
    val lcImported: String,

    val link: String,

    @SerializedName("link_debug_tags")
    val linkDebugTags: List<Any?>,

    @SerializedName("main_countries_tags")
    val mainCountriesTags: List<Any?>,

    @SerializedName("manufacturing_places")
    val manufacturingPlaces: String,

    @SerializedName("manufacturing_places_debug_tags")
    val manufacturingPlacesDebugTags: List<Any?>,

    @SerializedName("manufacturing_places_tags")
    val manufacturingPlacesTags: List<Any?>,

    @SerializedName("max_imgid")
    val maxImgid: String,

    @SerializedName("minerals_prev_tags")
    val mineralsPrevTags: List<Any?>,

    @SerializedName("minerals_tags")
    val mineralsTags: List<Any?>,

    @SerializedName("misc_tags")
    val miscTags: List<String>,

    @SerializedName("new_additives_n")
    val newAdditivesN: Long,

    @SerializedName("no_nutrition_data")
    val noNutritionData: String,

    @SerializedName("nova_group")
    val novaGroup: Long,

    @SerializedName("nova_group_debug")
    val novaGroupDebug: String,

    @SerializedName("nova_groups")
    val novaGroups: String,

    @SerializedName("nova_groups_tags")
    val novaGroupsTags: List<String>,

    @SerializedName("nucleotides_prev_tags")
    val nucleotidesPrevTags: List<Any?>,

    @SerializedName("nucleotides_tags")
    val nucleotidesTags: List<Any?>,

    @SerializedName("nutrient_levels")
    val nutrientLevels: NutrientLevels,

    @SerializedName("nutrient_levels_tags")
    val nutrientLevelsTags: List<String>,

    val nutriments: Nutriments,

    @SerializedName("nutriscore_data")
    val nutriscoreData: NutriscoreData,

    @SerializedName("nutriscore_grade")
    val nutriscoreGrade: String,

    @SerializedName("nutriscore_score")
    val nutriscoreScore: Long,

    @SerializedName("nutriscore_score_opposite")
    val nutriscoreScoreOpposite: Long,

    @SerializedName("nutrition_data")
    val nutritionData: String,

    @SerializedName("nutrition_data_per")
    val nutritionDataPer: String,

    @SerializedName("nutrition_data_per_debug_tags")
    val nutritionDataPerDebugTags: List<Any?>,

    @SerializedName("nutrition_data_per_imported")
    val nutritionDataPerImported: String,

    @SerializedName("nutrition_data_prepared")
    val nutritionDataPrepared: String,

    @SerializedName("nutrition_data_prepared_per")
    val nutritionDataPreparedPer: String,

    @SerializedName("nutrition_data_prepared_per_debug_tags")
    val nutritionDataPreparedPerDebugTags: List<Any?>,

    @SerializedName("nutrition_data_prepared_per_imported")
    val nutritionDataPreparedPerImported: String,

    @SerializedName("nutrition_grade_fr")
    val nutritionGradeFr: String,

    @SerializedName("nutrition_grades")
    val nutritionGrades: String,

    @SerializedName("nutrition_grades_tags")
    val nutritionGradesTags: List<String>,

    @SerializedName("nutrition_score_beverage")
    val nutritionScoreBeverage: Long,

    @SerializedName("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients")
    val nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients: Long,

    @SerializedName("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients_value")
    val nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue: Long,

    val origins: String,

    @SerializedName("origins_hierarchy")
    val originsHierarchy: List<String>,

    @SerializedName("origins_lc")
    val originsLc: String,

    @SerializedName("origins_old")
    val originsOld: String,

    @SerializedName("origins_tags")
    val originsTags: List<String>,

    @SerializedName("other_nutritional_substances_tags")
    val otherNutritionalSubstancesTags: List<Any?>,

    val packaging: String,

    @SerializedName("packaging_debug_tags")
    val packagingDebugTags: List<Any?>,

    @SerializedName("packaging_tags")
    val packagingTags: List<String>,

    val packagings: List<ProductPackaging>,
    val photographers: List<String>,

    @SerializedName("photographers_tags")
    val photographersTags: List<String>,

    @SerializedName("pnns_groups_1")
    val pnnsGroups1: String,

    @SerializedName("pnns_groups_1_tags")
    val pnnsGroups1_Tags: List<String>,

    @SerializedName("pnns_groups_2")
    val pnnsGroups2: String,

    @SerializedName("pnns_groups_2_tags")
    val pnnsGroups2_Tags: List<String>,

    @SerializedName("popularity_key")
    val popularityKey: Long,

    @SerializedName("popularity_tags")
    val popularityTags: List<String>,

    @SerializedName("product_name")
    val productName: String,

    @SerializedName("product_name_en")
    val productNameEn: String,

    @SerializedName("product_name_en_debug_tags")
    val productNameEnDebugTags: List<Any?>,

    @SerializedName("product_name_en_imported")
    val productNameEnImported: String,

    @SerializedName("product_quantity")
    val productQuantity: Long,

    @SerializedName("purchase_places")
    val purchasePlaces: String,

    @SerializedName("purchase_places_debug_tags")
    val purchasePlacesDebugTags: List<Any?>,

    @SerializedName("purchase_places_tags")
    val purchasePlacesTags: List<Any?>,

    val quantity: String,

    @SerializedName("quantity_debug_tags")
    val quantityDebugTags: List<Any?>,

    @SerializedName("removed_countries_tags")
    val removedCountriesTags: List<Any?>,

    val rev: Long,

    @SerializedName("scans_n")
    val scansN: Long,

    @SerializedName("selected_images")
    val selectedImages: SelectedImages,

    @SerializedName("serving_quantity")
    val servingQuantity: Long,

    @SerializedName("serving_size")
    val servingSize: String,

    @SerializedName("serving_size_debug_tags")
    val servingSizeDebugTags: List<Any?>,

    @SerializedName("serving_size_imported")
    val servingSizeImported: String,

    val sortkey: Long,
    val sources: List<Source>,

    @SerializedName("sources_fields")
    val sourcesFields: SourcesFields,

    val states: String,

    @SerializedName("states_hierarchy")
    val statesHierarchy: List<String>,

    @SerializedName("states_tags")
    val statesTags: List<String>,

    val stores: String,

    @SerializedName("stores_debug_tags")
    val storesDebugTags: List<Any?>,

    @SerializedName("stores_tags")
    val storesTags: List<Any?>,

    val traces: String,

    @SerializedName("traces_debug_tags")
    val tracesDebugTags: List<Any?>,

    @SerializedName("traces_from_ingredients")
    val tracesFromIngredients: String,

    @SerializedName("traces_from_user")
    val tracesFromUser: String,

    @SerializedName("traces_hierarchy")
    val tracesHierarchy: List<String>,

    @SerializedName("traces_tags")
    val tracesTags: List<String>,

    @SerializedName("unique_scans_n")
    val uniqueScansN: Long,

    @SerializedName("unknown_ingredients_n")
    val unknownIngredientsN: Long,

    @SerializedName("unknown_nutrients_tags")
    val unknownNutrientsTags: List<Any?>,

    @SerializedName("update_key")
    val updateKey: String,

    @SerializedName("vitamins_prev_tags")
    val vitaminsPrevTags: List<Any?>,

    @SerializedName("vitamins_tags")
    val vitaminsTags: List<Any?>
)

data class EcoscoreData (
    val adjustments: Adjustments,
    val agribalyse: Agribalyse,
    val missing: Missing,

    @SerializedName("missing_agribalyse_match_warning")
    val missingAgribalyseMatchWarning: Long,

    val status: String
)

data class Adjustments (
    @SerializedName("origins_of_ingredients")
    val originsOfIngredients: OriginsOfIngredients,

    val packaging: AdjustmentsPackaging,

    @SerializedName("production_system")
    val productionSystem: Agribalyse,

)

data class OriginsOfIngredients (
    @SerializedName("aggregated_origins")
    val aggregatedOrigins: List<AggregatedOrigin>,

    @SerializedName("epi_score")
    val epiScore: Long,

    @SerializedName("epi_value")
    val epiValue: Long,

    @SerializedName("origins_from_origins_field")
    val originsFromOriginsField: List<String>,

    @SerializedName("transportation_score_be")
    val transportationScoreBe: Long,

    @SerializedName("transportation_score_ch")
    val transportationScoreCh: Long,

    @SerializedName("transportation_score_de")
    val transportationScoreDe: Long,

    @SerializedName("transportation_score_es")
    val transportationScoreEs: Long,

    @SerializedName("transportation_score_fr")
    val transportationScoreFr: Long,

    @SerializedName("transportation_score_ie")
    val transportationScoreIe: Long,

    @SerializedName("transportation_score_it")
    val transportationScoreIt: Long,

    @SerializedName("transportation_score_lu")
    val transportationScoreLu: Long,

    @SerializedName("transportation_score_nl")
    val transportationScoreNl: Long,

    @SerializedName("transportation_value_be")
    val transportationValueBe: Long,

    @SerializedName("transportation_value_ch")
    val transportationValueCh: Long,

    @SerializedName("transportation_value_de")
    val transportationValueDe: Long,

    @SerializedName("transportation_value_es")
    val transportationValueEs: Long,

    @SerializedName("transportation_value_fr")
    val transportationValueFr: Long,

    @SerializedName("transportation_value_ie")
    val transportationValueIe: Long,

    @SerializedName("transportation_value_it")
    val transportationValueIt: Long,

    @SerializedName("transportation_value_lu")
    val transportationValueLu: Long,

    @SerializedName("transportation_value_nl")
    val transportationValueNl: Long,

    @SerializedName("value_be")
    val valueBe: Long,

    @SerializedName("value_ch")
    val valueCh: Long,

    @SerializedName("value_de")
    val valueDe: Long,

    @SerializedName("value_es")
    val valueEs: Long,

    @SerializedName("value_fr")
    val valueFr: Long,

    @SerializedName("value_ie")
    val valueIe: Long,

    @SerializedName("value_it")
    val valueIt: Long,

    @SerializedName("value_lu")
    val valueLu: Long,

    @SerializedName("value_nl")
    val valueNl: Long
)

data class AggregatedOrigin (
    val origin: String,
    val percent: Long
)

data class AdjustmentsPackaging (
    @SerializedName("non_recyclable_and_non_biodegradable_materials")
    val nonRecyclableAndNonBiodegradableMaterials: Long,

    val packagings: List<PackagingPackaging>,
    val score: Long,
    val value: Long,
    val warning: String
)

data class PackagingPackaging (
    @SerializedName("ecoscore_material_score")
    val ecoscoreMaterialScore: Long,

    @SerializedName("ecoscore_shape_ratio")
    val ecoscoreShapeRatio: Long,

    val material: String,

    @SerializedName("non_recyclable_and_non_biodegradable")
    val nonRecyclableAndNonBiodegradable: String,

    val shape: String
)

data class Agribalyse (
    val warning: String
)

data class Missing (
    @SerializedName("agb_category")
    val agbCategory: Long,

    val labels: Long,
    val packagings: Long
)

data class Images (
    @SerializedName("1")
    val the1: The1,

    @SerializedName("2")
    val the2: The1,

    @SerializedName("3")
    val the3: The1,

    @SerializedName("4")
    val the4: The1,

    @SerializedName("5")
    val the5: The1,

    val front: FrontEnClass,

    @SerializedName("front_en")
    val frontEn: FrontEnClass,

    val ingredients: FrontEnClass,

    @SerializedName("ingredients_en")
    val ingredientsEn: FrontEnClass,

    val nutrition: FrontEnClass,

    @SerializedName("nutrition_en")
    val nutritionEn: FrontEnClass
)

data class FrontEnClass (
    val geometry: String,
    val imgid: String,
    val normalize: String? = null,
    val rev: String,
    val sizes: Sizes,

    @SerializedName("white_magic")
    val whiteMagic: Any? = null
)

data class Sizes (
    @SerializedName("100")
    val the100: The100,

    @SerializedName("400")
    val the400: The100,

    val full: The100,

    @SerializedName("200")
    val the200: The100? = null
)

data class The100 (
    val h: Long,
    val w: Long
)

data class The1 (
    val sizes: Sizes,

    @SerializedName("uploaded_t")
    val uploadedT: Long,

    val uploader: String
)

data class Ingredient (
    @SerializedName("has_sub_ingredients")
    val hasSubIngredients: HasSubIngredients? = null,

    val id: String,

    @SerializedName("percent_estimate")
    val percentEstimate: Double,

    @SerializedName("percent_max")
    val percentMax: Double,

    @SerializedName("percent_min")
    val percentMin: Double,

    val rank: Long? = null,
    val text: String,
    val vegan: HasSubIngredients? = null,
    val vegetarian: HasSubIngredients? = null,
    val processing: String? = null
)

enum class HasSubIngredients(val value: String) {
    Yes("yes");

    companion object {
        public fun fromValue(value: String): HasSubIngredients = when (value) {
            "yes" -> Yes
            else  -> throw IllegalArgumentException()
        }
    }
}

data class Languages (
    @SerializedName("en:english")
    val enEnglish: Long
)

data class LanguagesCodes (
    val en: Long
)

data class NutrientLevels (
    val fat: String,
    val salt: String,

    @SerializedName("saturated-fat")
    val saturatedFat: String,

    val sugars: String
)

data class Nutriments (
    val calcium: Double,

    @SerializedName("calcium_100g")
    val calcium100G: Double,

    @SerializedName("calcium_serving")
    val calciumServing: Double,

    @SerializedName("calcium_unit")
    val calciumUnit: String,

    @SerializedName("calcium_value")
    val calciumValue: Long,

    val carbohydrates: Double,

    @SerializedName("carbohydrates_100g")
    val carbohydrates100G: Double,

    @SerializedName("carbohydrates_serving")
    val carbohydratesServing: Long,

    @SerializedName("carbohydrates_unit")
    val carbohydratesUnit: String,

    @SerializedName("carbohydrates_value")
    val carbohydratesValue: Double,

    val cholesterol: Long,

    @SerializedName("cholesterol_100g")
    val cholesterol100G: Long,

    @SerializedName("cholesterol_serving")
    val cholesterolServing: Long,

    @SerializedName("cholesterol_unit")
    val cholesterolUnit: String,

    @SerializedName("cholesterol_value")
    val cholesterolValue: Long,

    val energy: Long,

    @SerializedName("energy-kcal")
    val energyKcal: Long,

    @SerializedName("energy-kcal_100g")
    val energyKcal100G: Long,

    @SerializedName("energy-kcal_serving")
    val energyKcalServing: Long,

    @SerializedName("energy-kcal_unit")
    val energyKcalUnit: String,

    @SerializedName("energy-kcal_value")
    val energyKcalValue: Long,

    @SerializedName("energy_100g")
    val energy100G: Long,

    @SerializedName("energy_serving")
    val energyServing: Long,

    @SerializedName("energy_unit")
    val energyUnit: String,

    @SerializedName("energy_value")
    val energyValue: Long,

    val fat: Double,

    @SerializedName("fat_100g")
    val fat100G: Double,

    @SerializedName("fat_serving")
    val fatServing: Long,

    @SerializedName("fat_unit")
    val fatUnit: String,

    @SerializedName("fat_value")
    val fatValue: Double,

    val fiber: Double,

    @SerializedName("fiber_100g")
    val fiber100G: Double,

    @SerializedName("fiber_serving")
    val fiberServing: Double,

    @SerializedName("fiber_unit")
    val fiberUnit: String,

    @SerializedName("fiber_value")
    val fiberValue: Double,

    @SerializedName("fruits-vegetables-nuts-estimate-from-ingredients_100g")
    val fruitsVegetablesNutsEstimateFromIngredients100G: Long,

    val iron: Double,

    @SerializedName("iron_100g")
    val iron100G: Double,

    @SerializedName("iron_serving")
    val ironServing: Double,

    @SerializedName("iron_unit")
    val ironUnit: String,

    @SerializedName("iron_value")
    val ironValue: Double,

    @SerializedName("nova-group")
    val novaGroup: Long,

    @SerializedName("nova-group_100g")
    val novaGroup100G: Long,

    @SerializedName("nova-group_serving")
    val novaGroupServing: Long,

    @SerializedName("nutrition-score-fr")
    val nutritionScoreFr: Long,

    @SerializedName("nutrition-score-fr_100g")
    val nutritionScoreFr100G: Long,

    val proteins: Double,

    @SerializedName("proteins_100g")
    val proteins100G: Double,

    @SerializedName("proteins_serving")
    val proteinsServing: Long,

    @SerializedName("proteins_unit")
    val proteinsUnit: String,

    @SerializedName("proteins_value")
    val proteinsValue: Double,

    val salt: Double,

    @SerializedName("salt_100g")
    val salt100G: Double,

    @SerializedName("salt_serving")
    val saltServing: Double,

    @SerializedName("salt_unit")
    val saltUnit: String,

    @SerializedName("salt_value")
    val saltValue: Long,

    @SerializedName("saturated-fat")
    val saturatedFat: Double,

    @SerializedName("saturated-fat_100g")
    val saturatedFat100G: Double,

    @SerializedName("saturated-fat_serving")
    val saturatedFatServing: Double,

    @SerializedName("saturated-fat_unit")
    val saturatedFatUnit: String,

    @SerializedName("saturated-fat_value")
    val saturatedFatValue: Double,

    val sodium: Double,

    @SerializedName("sodium_100g")
    val sodium100G: Double,

    @SerializedName("sodium_serving")
    val sodiumServing: Double,

    @SerializedName("sodium_unit")
    val sodiumUnit: String,

    @SerializedName("sodium_value")
    val sodiumValue: Long,

    val sugars: Double,

    @SerializedName("sugars_100g")
    val sugars100G: Double,

    @SerializedName("sugars_serving")
    val sugarsServing: Long,

    @SerializedName("sugars_unit")
    val sugarsUnit: String,

    @SerializedName("sugars_value")
    val sugarsValue: Double,

    @SerializedName("trans-fat")
    val transFat: Long,

    @SerializedName("trans-fat_100g")
    val transFat100G: Long,

    @SerializedName("trans-fat_serving")
    val transFatServing: Long,

    @SerializedName("trans-fat_unit")
    val transFatUnit: String,

    @SerializedName("trans-fat_value")
    val transFatValue: Long,

    @SerializedName("vitamin-a")
    val vitaminA: Double,

    @SerializedName("vitamin-a_100g")
    val vitaminA100G: Double,

    @SerializedName("vitamin-a_serving")
    val vitaminAServing: Double,

    @SerializedName("vitamin-a_unit")
    val vitaminAUnit: String,

    @SerializedName("vitamin-a_value")
    val vitaminAValue: Long,

    @SerializedName("vitamin-c")
    val vitaminC: Long,

    @SerializedName("vitamin-c_100g")
    val vitaminC100G: Long,

    @SerializedName("vitamin-c_serving")
    val vitaminCServing: Long,

    @SerializedName("vitamin-c_unit")
    val vitaminCUnit: String,

    @SerializedName("vitamin-c_value")
    val vitaminCValue: Long
)

data class NutriscoreData (
    val energy: Long,

    @SerializedName("energy_points")
    val energyPoints: Long,

    @SerializedName("energy_value")
    val energyValue: Long,

    val fiber: Double,

    @SerializedName("fiber_points")
    val fiberPoints: Long,

    @SerializedName("fiber_value")
    val fiberValue: Double,

    @SerializedName("fruits_vegetables_nuts_colza_walnut_olive_oils")
    val fruitsVegetablesNutsColzaWalnutOliveOils: Long,

    @SerializedName("fruits_vegetables_nuts_colza_walnut_olive_oils_points")
    val fruitsVegetablesNutsColzaWalnutOliveOilsPoints: Long,

    @SerializedName("fruits_vegetables_nuts_colza_walnut_olive_oils_value")
    val fruitsVegetablesNutsColzaWalnutOliveOilsValue: Long,

    val grade: String,

    @SerializedName("is_beverage")
    val isBeverage: Long,

    @SerializedName("is_cheese")
    val isCheese: Long,

    @SerializedName("is_fat")
    val isFat: Long,

    @SerializedName("is_water")
    val isWater: Long,

    @SerializedName("negative_points")
    val negativePoints: Long,

    @SerializedName("positive_points")
    val positivePoints: Long,

    val proteins: Double,

    @SerializedName("proteins_points")
    val proteinsPoints: Long,

    @SerializedName("proteins_value")
    val proteinsValue: Double,

    @SerializedName("saturated_fat")
    val saturatedFat: Double,

    @SerializedName("saturated_fat_points")
    val saturatedFatPoints: Long,

    @SerializedName("saturated_fat_ratio")
    val saturatedFatRatio: Double,

    @SerializedName("saturated_fat_ratio_points")
    val saturatedFatRatioPoints: Long,

    @SerializedName("saturated_fat_ratio_value")
    val saturatedFatRatioValue: Long,

    @SerializedName("saturated_fat_value")
    val saturatedFatValue: Double,

    val score: Long,
    val sodium: Long,

    @SerializedName("sodium_points")
    val sodiumPoints: Long,

    @SerializedName("sodium_value")
    val sodiumValue: Long,

    val sugars: Double,

    @SerializedName("sugars_points")
    val sugarsPoints: Long,

    @SerializedName("sugars_value")
    val sugarsValue: Double
)

data class ProductPackaging (
    val material: String,
    val shape: String
)

data class SelectedImages (
    val front: SelectedImagesFront,
    val ingredients: SelectedImagesFront,
    val nutrition: SelectedImagesFront
)

data class SelectedImagesFront (
    val display: Display,
    val small: Display,
    val thumb: Display
)

data class Display (
    val en: String
)

data class Source (
    val fields: List<String>,
    val id: String,
    val images: List<Any?>,

    @SerializedName("import_t")
    val importT: Long,

    val url: String? = null,
    val manufacturer: Any? = null,
    val name: String? = null
)

data class SourcesFields (
    @SerializedName("org-database-usda")
    val orgDatabaseUsda: OrgDatabaseUsda
)

data class OrgDatabaseUsda (
    @SerializedName("available_date")
    val availableDate: String,

    @SerializedName("fdc_category")
    val fdcCategory: String,

    @SerializedName("fdc_data_source")
    val fdcDataSource: String,

    @SerializedName("fdc_id")
    val fdcID: String,

    @SerializedName("modified_date")
    val modifiedDate: String,

    @SerializedName("publication_date")
    val publicationDate: String
)
