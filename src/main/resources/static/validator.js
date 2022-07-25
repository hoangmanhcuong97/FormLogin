
function Validator(options) {
    var formElement = document.querySelector(options.form);

    if (formElement){
       options.rules.forEach( (rule) => console.log(rule));
    }
}

Validator.isRequired = function (selector) {
    return {
        selector: selector,
        test: function () {

        }
    };
}
Validator.isEmail = function (selector) {
    return {
        selector: selector,
        test: function () {

        }
    };
}

