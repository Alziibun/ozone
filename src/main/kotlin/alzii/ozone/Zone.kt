package alzii.ozone

import net.neoforged.fml.common.EventBusSubscriber
import org.joml.Vector3i

@EventBusSubscriber
open class Zone(
    var parent: Zone? = null,
    var start: Vector3i,
    var end: Vector3i,
    var useZAxis: Boolean,
    val children: List<Zone> = mutableListOf()
) {
    /**
     * Creates a child of this zone at the [start] and [end] coordinates
     *
     * The child is added it to the [ZoneManager] immediately.
     */
    fun createChild(start: Vector3i, end: Vector3i): Zone {
        val child = Zone(this, start, end, useZAxis)
        ZoneManager.add(child)
        return child
    }

    fun isChild(zone: Zone): Boolean {
        var checkZone = parent
        while (checkZone != null) {
            if (checkZone == zone) {
                return true
            }
            checkZone = checkZone.parent
        }
        return false
    }
}