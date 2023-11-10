package layout

import androidx.fragment.app.Fragment

class PlantDetail: Fragment() {

    private lateinit var binding: FragmentPlantDetailBinding

    private lateinit var plant: PlantDetail

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        plant = Plant(
            id = UUID.randomUUID(),
            title = "",
            date = Date(),
            isSolved = false
        )

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding =
                FragmentPlantDetailBinding.inflate(layoutInflater, container, false)
            return binding.root

            override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                super.onViewCreated(view, savedInstanceState)
                binding.apply {
                    PlantDetail.doOnTextChanged { text, _, _, _ ->
                        plant = plant.copy(title = text.toString())

                        PlantDate.apply {
                            text = plant.date.toString()
                            isEnabled = false

                            override fun onDestroyView() {
                                super.onDestroyView()
                                binding = null
                            }
    }
}

