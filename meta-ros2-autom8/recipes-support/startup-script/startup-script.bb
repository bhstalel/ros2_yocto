DESCRIPTON = "A test systemd service"
LICENSE = "CLOSED"

RDEPENDS_${PN} += "bash"
inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "startup-script-001.service"

SRC_URI_append = " file://startup-script-001.service "
FILES_${PN} += "${systemd_unitdir}/system/startup-script-001.service"

do_install_append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/startup-script-001.service ${D}/${systemd_unitdir}/system
}
