package alzii.ozone

object ZoneManager {
    val zones = mutableListOf<Zone>()

    fun add(zone: Zone) {
        zones.add(zone)
    }

    fun remove(zone: Zone) {
        zones.remove(zone)
    }
}