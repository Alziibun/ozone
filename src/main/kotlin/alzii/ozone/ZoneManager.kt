package alzii.ozone

object ZoneManager {
    val zones: MutableList<in Zone> = mutableListOf()

    fun add(zone: Zone) {
        zones.add(zone)
    }

    fun remove(zone: Zone) {
        zones.remove(zone)
    }
}