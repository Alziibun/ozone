package alzii.ozone

import net.neoforged.fml.common.EventBusSubscriber
import org.joml.Vector3i

@EventBusSubscriber
class Zone(
    var parent: Zone?,
    var start: Vector3i,
    var end: Vector3i,
    var useZAxis: Boolean = false
) {
    val children = mutableListOf<Zone>()

    init {
        ZoneManager.add(this)
    }

    fun createChild(start: Vector3i, end: Vector3i): Zone {
        val zone = Zone(this, start, end, useZAxis)
        children.add(zone)
        return zone
    }
}