import * as dom from 'sweetalert2/src/utils/dom'

/**
 * @param {SweetAlert2} instance
 * @param {SweetAlertOptions} params
 */
export const renderFooter = (instance, params) => {
  const footer = dom.getFooter()

  dom.toggle(footer, params.footer)

  if (params.footer) {
    dom.parseHtmlToContainer(params.footer, footer)
  }

  // Custom class
  dom.applyCustomClass(footer, params, 'footer')
}
